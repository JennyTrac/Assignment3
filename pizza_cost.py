# Created by: Jenny Trac
# Created on: Oct 6 2017
# This program allows user to choose size and number
# of toppings on their pizza and will output the cost

import ui

HST = 0.13
LARGE = 6.00
EXTRA_LARGE = 10.00
COST_PER_TOPPING = 0.75
CHEESE = 0.25

def calculate_touch_up_inside(sender):
    # calculates cost of pizza
    
    # input
    size = int(view['size_textfield'].text)
    toppings = int(view['toppings_textfield'].text)
    
    # process
    if (toppings > 4) or (toppings < 0):
        view['subtotal_label'].text = "Not an option for toppings."
    elif (toppings <= 4) and (toppings >= 0):
        if (size == 1):
            subtotal = LARGE + (toppings * COST_PER_TOPPING) + CHEESE
            hst = subtotal * HST
            total = subtotal + hst
            # output
            view['subtotal_label'].text = "Subtotal: " + '${:,.2f}'.format(subtotal)
            view['hst_label'].text = "HST: " + '${:,.2f}'.format(hst)
            view['total_label'].text = "Total: " + '${:,.2f}'.format(total)
        if (size == 2):
            subtotal = EXTRA_LARGE + (toppings * COST_PER_TOPPING) + CHEESE
            hst = subtotal * HST
            total = subtotal + hst
            # output
            view['subtotal_label'].text = "Subtotal: " + '${:,.2f}'.format(subtotal)
            view['hst_label'].text = "HST: " + '${:,.2f}'.format(hst)
            view['total_label'].text = "Total: " + '${:,.2f}'.format(total)
        elif (size != 1) and (size !=2):
            view['subtotal_label'].text = "Not a size option."
    


view = ui.load_view()
view.present('sheet')
